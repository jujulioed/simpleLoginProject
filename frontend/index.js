async function fetchData() {
    try{
        const message = document.getElementById("testField").value;

        const response = await fetch("http://localhost:8080/test", {
            method: "POST",
            body: JSON.stringify({body: message})
        });
        if(!response.ok) {
            throw new Error("Could not fetch resources");
        }

        const data = await response.json();
        console.log(data);
        const apiResponseField = document.getElementById("apiResponse");
        apiResponseField.innerHTML = data.bodySent;
    }
    catch(error) {
        console.error(error);
    }
}

async function TestAPI() {

    try {
        const response = await fetch("http://localhost:8080/test");
        if(!response.ok) {
            throw new Error("Failed");
        }

        const data = await response.json();
        const apiTestField = document.getElementById("getApiFieldTest");
        apiTestField.innerHTML = data.message;
    } catch(error) {
        console.error(error);
    }
}

function ResetField() {
    const apiTestField = document.getElementById("getApiFieldTest");
    apiTestField.innerHTML = "Waiting..."
}