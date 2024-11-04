// 1.print out "program started" at the start of your code
// 2.create a promise that resolves after 3 seconds
// 3.Log out the promise while it's pending
// 4.print out "program in progress..." as well
// 5.print out "program complete" when the promise completes after 3 sec

console.log("Program Executed");

const myPromise = new Promise((resolve,reject) =>{
    setTimeout(()=>{
        resolve("Program complete");
    }, 3000)
});

console.log(myPromise);
console.log("Program in progress...");

// console.log(myPromise);

myPromise.then((value)=>{
    console.log(value);
});
