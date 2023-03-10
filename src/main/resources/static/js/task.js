function toggleLabel(checkbox) {
    var label = checkbox.nextElementSibling;
    if (checkbox.checked) {
        label.classList.add("crossed-out");
    } else {
        label.classList.remove("crossed-out");
    }
}