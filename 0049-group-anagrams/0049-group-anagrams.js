/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let map = new Map();
    for(str of strs){
        let mapKey = new Array(26).fill(0);
        for(c of str){
            let index = c.charCodeAt(0) - 'a'.charCodeAt(0);
            mapKey[index]++;
        }
        if(!map.has(mapKey.toString())) map.set(mapKey.toString(),[]);
        map.get(mapKey.toString()).push(str);
    }
    return Array.from(map.values());
};