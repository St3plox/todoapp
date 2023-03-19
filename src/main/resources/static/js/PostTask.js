const app = new Vue({
    el: '#apppost',
    data: {
        task: {
            name: '',
            date: ''
        }
    },

    methods: {
        async submitTask() {
            try {
                const response = await fetch('http://localhost:8080/task', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify(this.task),
                });

                if (response.ok) {
                    window.location.href = 'http://localhost:8080';
                } else {
                    console.error("ERROR");
                }
            } catch (error) {
                console.error(error);
            }
        },
    },
})