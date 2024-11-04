/*
1.print out "Program started" at the start of your code
2.create a promise that resolves after 3 sec
3.log out the promise while it's pending
4.print out "Program in progress..." as well
5.print out "step 1 complete" when the promise fulfills
6.Have the first promise return another new promise that will fulfill after 3 sec with the emessage: "step 2 complete"
7.Print out the message from the second promise after it fulfills ("step 2 complete")
*/

console.log("Program started");

const myPromise = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve();
    }, 3000);    
});

console.log(myPromise);
console.log("Program in progress");
myPromise
    .then(()=>{
        console.log("step 1 complete");  
        return new Promise((resolve, reject) => {
            setTimeout(() => {
                resolve("step 2 complete");
            }, 6000);
        })      
    })
    .then((value)=>{
        console.log(value);
        
    });    



