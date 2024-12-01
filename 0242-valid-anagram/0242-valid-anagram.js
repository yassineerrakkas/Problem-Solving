/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    let count = new Array(26).fill(0);
    for(let c of s){
        count[c.charCodeAt(0)-'a'.charCodeAt(0)] += 1;
    }
    for(let c of t){
        let index = c.charCodeAt(0)-'a'.charCodeAt(0)
        count[index] -= 1;
    }
    for(let i of count){
        if(i != 0) return false;
    }
    return true;
};