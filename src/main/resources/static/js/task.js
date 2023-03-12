function toggleLabel(checkbox) {
    let label = checkbox.nextElementSibling;
    if (checkbox.checked) {
        label.classList.add("crossed-out");
    } else {
        label.classList.remove("crossed-out");
    }
}