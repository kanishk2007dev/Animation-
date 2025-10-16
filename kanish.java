document.addEventListener('DOMContentLoaded', () => {
    // Select the container for the 3D heart
    const heart = document.querySelector(".heart3d");

    // Loop 36 times (from i=1 to i=36)
    for (let i = 1; i <= 36; i++) {
        const rib = document.createElement("div");

        // Set the 'appear' animation with a delay (i * 0.1s)
        rib.style.animation = `appear ${i * 0.1}s infinite alternate linear`;
        
        // The 3D positioning logic for each rib:
        // 1. rotateY(${i * 10}deg): Rotates the rib around the vertical axis (10 degrees per rib)
        // 2. rotateZ(45deg): Tilts the heart shape itself
        // 3. translateX(62px): Moves the rib away from the center to form the circular cage
        rib.style.transform = `rotateY(${i * 10}deg) rotateZ(45deg) translateX(62px)`;

        // Append the new rib to the heart container
        heart.appendChild(rib);
    }
});
