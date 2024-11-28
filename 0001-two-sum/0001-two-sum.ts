function twoSum(nums: number[], target: number): number[] {
    let res: number[] = new Array(2);
    const myMap = new Map<number,number>();
    nums.forEach((num, i) =>{
        if(myMap.has(num)){
            res[0] = myMap.get(num);
            res[1] = i;
            return res;
        }else{
            myMap.set(target - num,i);
        }
    });
    return res;
};