import axios from 'axios';
const res = await axios.get(`localhost:8080/getdata`);


res.foreach(i => {
    if (res[i][taskDone])){
    var element = document.createElement("div");
    element.appendChild(document.createTextNode(res[i][taskID, taskName, taskDesc]));
    document.getElementById('taskView').appendChild(element + '${i}');
}
})

export default {
    data() {
        return {
            taskNameInput: '',
            taskDescriptionInput: '',
        }
    }
    methods: {
        submitForm() {
            this.$axios
                .post('/submittask', {
                    taskNameInput = this.taskNameInput,
                    taskDescriptionInput = this.taskDescriptionInput
                })
                .then((response) => {
                    console.log(response)
                })
                .catch((error) => {
                    console.log(error)
                })
        }
    }
}

