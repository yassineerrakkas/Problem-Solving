function groupAnagrams(strs: string[]): string[][] {
    let map = new Map<string, string[]>();
    for(const str of strs){
        const mapKey: number[] = new Array(26).fill(0);
        for(const c of str){
            let index: number = c.charCodeAt(0) - 'a'.charCodeAt(0);
            mapKey[index]++;
        }
        if(!map.has(mapKey.toString())) map.set(mapKey.toString(),[]);
        map.get(mapKey.toString()).push(str);
    }
    return Array.from(map.values());
};