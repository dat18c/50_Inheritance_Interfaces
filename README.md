# 50_Inheritance_Interfaces
Opsamling på øvelser i ArrayList

## Inheritance
`A extends B` definerer at klassen A er subklasse af klassen B
`super` bruges til at tilgå metoder og attributter i superklassen. Hvis ellers de kan tilgås.

## Opdater Kanban boards
Opdater Kanban boards. Tag et screenshot til opgave-rapporten.

## Øvelse
Almindelig terning og ludoterning (3 og 5 erstattet af stjerne og globus)
`LudoTerning extends Terning`
Opret ArrayList med terninger. I kan putte både almindelige og Ludoterninger i Array'et.

Lav `roll` metode, der tilfældigt giver et slag med terningen. Skriv resultatet ud vha. toString.

Lidt hints til mulige implementeringer af dele af koden med og uden brug af switch:
```
String eyes;

Random r = new Random();
switch (r.nextInt(6)+1) {
case 1:
    this.eyes = "1";
    break;
case 2:
    this.eyes = "2";
    break;
...
default:
    break;
}
// this.eyes = Integer.toString(r.nextInt(6)+1);
```

Reges p.683 ex 4 (lav først p. 675-676 self-check 8-9).

Reges p. 683-684 ex. 5 - 8.

# Næste gang Interfaces
`Implements`
En anden måde at sikre polymorfi

## Øvelse
Laves næste gang vha. Interfaces:
Snydeterning, der giver 6, når der slås 1 eller to - både den almindelige terning og ludoterningen
