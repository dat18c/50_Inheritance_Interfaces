# 50_Inheritance_Interfaces
Opsamling på øvelser i ArrayList

## Inheritance
`Extends`

Car <- Sportscar
    <- Lorry

## Øvelse
Almindelig terning og ludoterning (3 og 5 erstattet af stjerne og globus)

Lav `roll` metode, der tilfældigt giver et slag med terningen. Skriv resultatet ud.

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
# Interfaces
`Implements`
En anden måde at sikre polymorfi

## Øvelse
Snydeterning, der giver 6, når der slås 1 eller to - både den almindelige terning og ludoterningen
