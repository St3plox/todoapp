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
                const response = await fetch('/task', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify(this.task),
                });

                if (response.ok) {
                    window.location.href = '/';
                } else {
                    console.error("ERROR");
                }
            } catch (error) {
                console.error(error);
            }
        },
    },
})