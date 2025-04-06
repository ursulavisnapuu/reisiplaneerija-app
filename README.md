# Reisiplaneerija äpp 

**Veebipõhine reiside planeerimise rakendus**, loodud peredele ja paaridele. Rakendus aitab korraldada reisi algusest lõpuni – alates sihtkoha määramisest kuni tegevuste ja kulude haldamiseni.

---

## Eesmärk

Luua kasutajasõbralik, intuitiivne ja laiendatav äpp, mis võimaldab:
- 📍 Planeerida reise (sihtkoht, kuupäevad, osalejad)
- 📝 Hallata reisi tegevusi ja majutust
- 💰 Jälgida ja kokku arvutada reisi kulusid
- 🧾 Säilitada reisiandmeid (minevik vs tulevik)
- 📊 Tulevikus: vaadata statistikat ja jagada reisiplaane


---

## Tehnoloogiad

| Komponent      | Tehnoloogia         |
|----------------|---------------------|
| **Back-end**   | Java, Spring Boot   |
| **Andmebaas**  | H2 (arendus), JPA   |
| **Front-end**  | HTML/CSS/JS (tulemas) |
| **Muu**        | Git, GitHub         |

---

## Kaustastruktuur

reisiplaneerija-app/
├── backend/              ← Spring Boot API
│   ├── model/
│   ├── repository/
│   ├── service/
│   └── controller/
├── frontend/             ← Kasutajaliides (tulemas)
└── README.md             ← See fail



---

##  Arenduse staatus

| Moodul          | Staatus     | Märkused                         |
|------------------|-------------|----------------------------------|
| Trip API         | ✅ Valmis   | GET + POST toimivad              |
| Activity, Majutus, Kulud | 🟡 Töös   | Mudelid lisanduvad järk-järgult |
| Front-end UI     | ⬜ Tulemas   | HTML/JS liides                   |
| Docker & deploy  | ⬜ Tulemas   | Pärast MVP valmimist             |

---

## Käivitamine (lokalne)

```bash
cd backend
./mvnw spring-boot:run

## Testi brauseris:

http://localhost:8080/ping
http://localhost:8080/trips

## Autor
Ursula Visnapuu
GitHub

## Märkmed
🗓 Projekt algas aprillis 2025.
Eesmärk: luua täislahendus (back + front) koos visuaalse planeerimisliidesega.