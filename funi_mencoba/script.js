const bird = document.getElementById("bird");

let isJumping = false;

document.addEventListener("keydown", (event) => {
    if (event.key === " " && !isJumping) {
        jump();
    }
});

function jump() {
    isJumping = true;
    let position = 0;
    const jumpInterval = setInterval(() => {
        if (position >= 100) {
            clearInterval(jumpInterval);
            isJumping = false;
        } else {
            position += 5;
            bird.style.bottom = podition + "px";
        }
    }, 20);
}