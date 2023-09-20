lines = "4 3";


const nums = lines.split(' ');
const r1 = Number(nums[0]);
const s = Number(nums[1]);
const r2 = average(r1, s);

function average(r1, s){
    return ((s*2)-(r1*1));
}

console.log(r2);
