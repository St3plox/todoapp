let app = new Vue({
    el: '#app',
    data: {
        tasks: [],
        task: {
            name: '',
            date: ''
        }
    },
    mounted: function () {
        // Fetch data from localhost
        fetch('http://localhost:8080/task/all')
            .then(response => response.json())
            .then(data => {
                // Assign fetched data to tasks array
                this.tasks = data.map(task => {
                    return {
                        name: task.name,
                        checked: false
                    };
                });
            })
            .catch(error => console.log(error));
    },
});