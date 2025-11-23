        document.addEventListener('DOMContentLoaded', () => {
            const loginForm = document.getElementById('loginForm');
            const messageElement = document.getElementById('message');
            loginForm.addEventListener('submit', (event) => {
                event.preventDefault();
                const username = document.getElementById('username').value;
                const password = document.getElementById('password').value;
                const VALID_USERNAME = "usuario";
                const VALID_PASSWORD = "1234";
                if (username === VALID_USERNAME && password === VALID_PASSWORD) {
                    messageElement.textContent = "¡Login correcto! Redirigiendo...";
                    messageElement.className = 'success'; 
                    messageElement.textContent = "Usuario o contraseña incorrectos.";
                    messageElement.className = 'error'; 
                }
            });
        });