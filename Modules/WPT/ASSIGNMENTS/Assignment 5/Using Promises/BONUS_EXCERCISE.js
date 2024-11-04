const myPromise1 = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve(10);
    }, 2000);
});
const myPromise2 = new Promise((resolve,reject)=>{
    setTimeout(() => {
        resolve(20);
    }, 2000);
});

Promise.all([myPromise1,myPromise2])
.then((values)=>{
    const val1 = values[0];
    const val2 = values[1];
    console.log(val1+val2);
    
})