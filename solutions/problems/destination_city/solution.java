class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

        for(List<String> el: paths)
            set.add(el.get(1));
        
        for(List<String> el: paths)
            set.remove(el.get(0));
        
        return set.iterator().next();
    }
}