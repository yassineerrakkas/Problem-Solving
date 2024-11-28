function removeDuplicates(nums: number[]): number {
    let temp:number = nums[0];
    let index:number = 1;
    for(let i: number = 0; i< nums.length; i++){
        if(temp != nums[i]){
            nums[index] = nums[i];
            temp = nums[i];
            index++;
        }
    }
    return index;
};