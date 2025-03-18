// testoDinamico scrive nel primo .animazione-scrittura span che trova libero
const testoDinamico = document.querySelector(".animazione-scrivere span");
// Array delle parole che scorrono
const parole = [
    "facile", "veloce", 
    "pratico", "comodo", 
    "organizzato", "digitale", 
    "semplice", "chiaro", "ordinato", 
    "funzionale", "diretto"
];
// Valori iniziali
let indiceParola = 0;
let indiceLettera = 0;
let isDeleting = false;
// Funzione di scrittura
const effettoScrittura = () => {
    const parolaAttuale = parole[indiceParola]; 
    const letteraAttuale = parolaAttuale.substring(0, indiceLettera);
    
    // Aggiunge la letter attuale
    testoDinamico.textContent = letteraAttuale;
    // Disattiva il blink della " | " durante la scrittura
    testoDinamico.classList.add("stop-blinking");

    //Se vera manda avanti di una lettera per continuare a scrivere
    if(!isDeleting && indiceLettera < parolaAttuale.length){
        indiceLettera++;
        setTimeout(effettoScrittura, 200);
    } else if(isDeleting && indiceLettera > 0){ // Se vera torna indietro di una lettera per cancellare
        indiceLettera--;
        setTimeout(effettoScrittura, 100);
    } else { // Finita la scrittura o la cancellazione riattiva il blinking e passa alla parola successiva
        isDeleting = !isDeleting;
        testoDinamico.classList.remove("stop-blinking");
        indiceParola = !isDeleting ? (indiceParola + 1) % parole.length : indiceParola;
        setTimeout(effettoScrittura, 1200);
    }
}
// Avvio
effettoScrittura();