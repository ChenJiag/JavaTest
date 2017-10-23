用TreeMap 使Map<k,v> 基于v 排序。（注：必须重写compare方法，TreeMap使用的是基于K的排序） 

HashMap<String,Double> mHashMap = new HashMap<String,Double>();
ValueComparator vComparator = new ValueComparator(mHashMap);
TreeMap<String, Double> sort_Map = new TreeMap<>(vComparator);
mHashMap.put("A", 90.0);
mHashMap.put("B", 91.5);
mHashMap.put("C", 85.9);
mHashMap.put("D", 60.6);
		
System.out.println(mHashMap);
sort_Map.putAll(mHashMap);
System.out.println(sort_Map);

class ValueComparator implements Comparator<String>
{
	Map<String,Double> base;
	public ValueComparator(Map<String, Double> base) 
	{
		this.base = base;
	}
   @Override
	public int compare(String a, String b)
    {
		if(base.get(a) >= base.get(b))
		{
			return -1;
		}
		else
		    return 1;
    }
}
