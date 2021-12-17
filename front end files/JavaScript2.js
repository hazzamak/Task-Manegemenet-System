function axiosTest() {
    const promise = axios.get('localhost:8080/getdata')
    const dataPromise = promise.then((response) => response.data)
    return dataPromise
}


function getInputFromTextBox() {
    var input = document.getElementById("userInput").value;
    alert(input);
    console.log(alert);
}



