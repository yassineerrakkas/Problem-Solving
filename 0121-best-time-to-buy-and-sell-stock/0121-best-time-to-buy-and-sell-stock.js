/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minPrice = Number.MAX_SAFE_INTEGER;
    let maxProfite = 0;
    for(let price of prices){
        minPrice = Math.min(minPrice,price);
        maxProfite = Math.max(maxProfite,price - minPrice );
    }
    return maxProfite;
};