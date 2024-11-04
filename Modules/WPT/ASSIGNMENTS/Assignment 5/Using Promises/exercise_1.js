/*
1.print out "Program started" at the start of your code
2.create a promise that resolves after 3 sec and rejects after 2sec.
3.log out the promise while it's pending
4.print out "Program in progress..." as well
5.print out "Program complete" if the promise fulfills
6.print out "Program failure" if the promise rejects
*/

console.log("Program started");

const myPromise = new Promise((resolve,reject)=>{
    setTimeout(()=>{
        resolve();
    },3000);

    setTimeout(() => {
        reject();
    }, 2000);

});

console.log(myPromise);
console.log("Program in progress...");

myPromise
    .then(()=>{
        console.log("Program completed");
    })
    .catch(()=>{
    console.log("Program failure!");   
    }); 

