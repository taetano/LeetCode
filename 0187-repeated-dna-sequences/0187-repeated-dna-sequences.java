class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> duple = new HashSet<>();
        Set<String> ansMaterials = new HashSet<>();
        
        for (int i = 0; i + 10 <= s.length(); i++) {
            String dna = s.substring(i, i + 10);
            if (!duple.add(dna)) {
                ansMaterials.add(dna);
            }
        }
        
        return new ArrayList(ansMaterials);
    }
}