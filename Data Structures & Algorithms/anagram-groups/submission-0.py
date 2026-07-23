class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        hmap=defaultdict(list)

        for i in strs:
            sortedI = ''.join(sorted(i))
            hmap[sortedI].append(i)
        
        return list(hmap.values())

        