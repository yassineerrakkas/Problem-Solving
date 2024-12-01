function topKFrequent(nums: number[], k: number): number[] {
    const map = new Map<number,number>();
    for(const num of nums){
        map.set(num, (map.get(num) || 0) + 1);
    }
    return Array.from(map.entries())
                .sort((val1, val2) => val2[1]-val1[1])
                .slice(0,k)
                .map(entry => entry[0]);
};