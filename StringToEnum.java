/**
*将String转换为Enum
*2017-10-29
*By cjg
*/

定义了枚举类型
public enum Test
{
    A,B,C,D 
}
调用 Test.valueOf("A")  相当于 Test.A


PLAN B:

public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) 
{
    if( c != null && string != null ) 
    {
        try 
        {
            return Enum.valueOf(c, string.trim().toUpperCase());
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    return null;
}

public static MyEnum fromString(String name) 
{
    return getEnumFromString(MyEnum.class, name);
}
