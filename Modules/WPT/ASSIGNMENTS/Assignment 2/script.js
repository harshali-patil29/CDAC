function changeStyle(){
    const paragraph = document.querySelector(".paragraph");
    paragraph.style.fontFamily = "Courier New, monospace";
    paragraph.style.fontSize = "2rem";
    paragraph.style.color = "red";
};

document.getElementById("form").addEventListener("submit",displayDetails);

function displayDetails(event){
    event.preventDefault();
    const firstname = document.getElementById("firstname").value;
    const lastname = document.getElementById("lastname").value;
    const contact = document.getElementById("contact").value;
    const email = document.getElementById("email").value;

    const show = document.getElementById("show");
    show.innerHTML = `
        <h3>Details:</h3>
        <p><strong>First Name: </strong> ${firstname}</p>
        <p><strong>Last Name: </strong> ${lastname}</p>
        <p><strong>Contact No.: </strong>${contact}</p>
        <p><strong>Email Id: </strong>${email}</p>    
    `;

};
document.getElementById('removeButton').addEventListener('click', function() {
    const select = document.getElementById('cart');
    const selectedOption = select.options[select.selectedIndex];

    if (selectedOption) {
        select.remove(select.selectedIndex); 
    } else {
        alert("Please select an item to remove.");
    }
});

function boldwords(){
    const spans = document.querySelectorAll("#para2 span");
    spans.forEach(span =>{
        span.style.color = "green";
    });
}