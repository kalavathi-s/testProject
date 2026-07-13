document.getElementById('loadMessage')?.addEventListener('click', async () => {
    const box = document.getElementById('messageBox');
    box.textContent = 'Loading...';

    try {
        const response = await fetch('api/message');
        const data = await response.json();
        box.textContent = `${data.message} (${data.timestamp})`;
    } catch (error) {
        box.textContent = 'Unable to load the message right now.';
    }
});
