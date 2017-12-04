首先StringBuffer和StringBuilder都是用char[] 存储的，当存储到了一定程度需要扩大的时候，OpenJdk为其分配两倍的新空间。

char[] value;
int count;
int length = str.lengtn();
public AbstractStringBuilder append(String str) {
    if(str == null)
        str = "null";
    if(len == 0)
        return this;
    int newCount = len + count;
    if(newCount > value.length)
        expandCapacity(newCount);
    str.getChars(0, len, value, count);
    count = newCount;
    return this;
}
void expandCapacity(int minimunCapacity) {
    int newCapacity = (value.length + 1) * 2;
    if(newCapacity < 0） {
        newCapacity = Integer.MAX_VALUE;
    } else if (minimunCapacity > newCapacity) {
        newCapacity = miniumCapacity;
      }
    value = Array.copyOf(value,newCapacity);
}
    
  
