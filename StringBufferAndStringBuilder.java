首先StringBuffer和StringBuilder都是用char[] 存储的，当存储到了一定程度需要扩大的时候，OpenJdk为其分配两倍的新空间。

char[] value;
