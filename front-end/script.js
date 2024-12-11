// script.js

// Seleciona o formulário
const userForm = document.getElementById('userForm');

// Adiciona o evento de envio de formulário
userForm.addEventListener('submit', async (event) => {
    event.preventDefault(); // Previne o comportamento padrão de envio do formulário

    // Pega os valores dos campos
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const username = document.getElementById('username').value;

    // Cria um objeto com os dados
    const userData = {
        email: email,
        password: password,
        username: username
    };

    try {
        // Envia os dados para o backend usando fetch
        const response = await fetch('http://localhost:2000/v1/users', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(userData)
        });

        // Verifica se a resposta foi bem-sucedida
        if (response.ok) {
            alert('Usuário criado com sucesso!');
        } else {
            alert('Erro ao criar usuário');
        }
    } catch (error) {
        console.error('Erro ao enviar requisição:', error);
        alert('Erro ao enviar requisição');
    }
});
