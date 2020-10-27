/*Hacer una pokedex que permita elegir ver los datos de 3 pokemones (prinicpales)
o tener la opcion para batalla*/
import java.util.Scanner;

class pokedex{
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        //variables
        char opcion,retorno;
        int pokemon, contrincante, hp, fuerza, defensa, atp, ats;//hp=vida, atp= ataque principal, ats= ataque secundario
        double impacto1, impacto2,hpf;

        do{
        System.out.println("3IV8 Sandoval Calderón Gerardo");
        System.out.println("Bienvenido a la pokedex, eliga lo que desea realizar");
        System.out.println("a.- Ver stats de los pokemon");
        System.out.println("b.- Modo pelea");
        System.out.println("c.- Salir");
        opcion = entrada.next().charAt(0);
            switch (opcion) {
                case 'a': 
                do{
                    System.out.println("Escoja el pokemon a checar:");
                    System.out.println("1.- Charmander");
                    System.out.println("2.- Bulbasaur");
                    System.out.println("3.- Squirtle");
                    System.out.println("0.- Regresar");
                    pokemon=entrada.nextInt();
                    if (pokemon==1){
                        //Charmander stats
                        System.out.println("Id: 000001");
                        System.out.println("Charmander");
                        System.out.println("Fuerza: 18");
                        System.out.println("Defensa: 20");
                        System.out.println("HP: 35/40");
                        System.out.println("Ataque principal: 10 atk");
                        System.out.println("Ataque secundario: 15 atk");
                    }
                    else if (pokemon==2){
                        //Bulbasaur stats
                        System.out.println("Id: 000020");
                        System.out.println("Bulbasaur");
                        System.out.println("Fuerza: 16");
                        System.out.println("Defensa: 23");
                        System.out.println("HP: 30/45");
                        System.out.println("Ataque principal: 8 atk");
                        System.out.println("Ataque secundario: 15 atk");
                    }
                    else if (pokemon==3){
                        //Squirtle stats
                        System.out.println("Id: 000005");
                        System.out.println("Squirtle");
                        System.out.println("Fuerza: 20");
                        System.out.println("Defensa: 17");
                        System.out.println("HP: 30/30");
                        System.out.println("Ataque principal: 17 atk");
                        System.out.println("Ataque secundario: 30 atk");
                    }
                    System.out.println("Ingrese una r para regresar o cualquier otra tecla para salir de este menu");
                    retorno= entrada.next().charAt(0);
                }while(retorno=='r');
                    break;

                case 'b':
                do{
                    System.out.println("Modo pelea");
                    System.out.println("Pokemon contrincante:");
                    System.out.println("1.- Charmander");
                    System.out.println("2.- Bulbasaur");
                    System.out.println("3.- Squirtle");
                    contrincante=entrada.nextInt();
                    System.out.println("Escoja su pokemon:");
                    System.out.println("1.- Charmander");
                    System.out.println("2.- Bulbasaur");
                    System.out.println("3.- Squirtle");
                    System.out.println("4.- huir");
                    pokemon=entrada.nextInt();
                    
                    if (pokemon==contrincante){
                        System.out.println("Suerte con la pelea, no hay datos para decir si vas a ganar o no"); 
                        if(pokemon==1){
                            System.out.println("Charmander vs Charmander");
                            hp=35;
                            fuerza=18;
                            defensa=20;
                            atp=10;
                            ats=15;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Charmander utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                                /* System.out.println("Id: 000001");
                        System.out.println("Charmander");
                        System.out.println("Fuerza: 18");
                        System.out.println("Defensa: 20");
                        System.out.println("HP: 35/40");
                        System.out.println("Ataque principal: 10 atk");
                        System.out.println("Ataque secundario: 15 atk");*/
                            }
                        else if (pokemon==2){
                            System.out.println("Bulbasaur vs Bulbasaur");
                            hp=30;
                            fuerza=16;
                            defensa=23;
                            atp=8;
                            ats=15;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Bulbasaur utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                                /*System.out.println("Id: 000020");
                        System.out.println("Bulbasaur");
                        System.out.println("Fuerza: 16");
                        System.out.println("Defensa: 23");
                        System.out.println("HP: 30/45");
                        System.out.println("Ataque principal: 8 atk");
                        System.out.println("Ataque secundario: 15 atk");*/
                        }
                        else if (pokemon==3){
                            System.out.println("Squirtle vs Squirtle");
                            hp=30;
                            fuerza=20;
                            defensa=17;
                            atp=17;
                            ats=30;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Squirtle utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                                /*System.out.println("Id: 000005");
                        System.out.println("Squirtle");
                        System.out.println("Fuerza: 20");
                        System.out.println("Defensa: 17");
                        System.out.println("HP: 30/30");
                        System.out.println("Ataque principal: 17 atk");
                        System.out.println("Ataque secundario: 30 atk"); */
                        }
                        }
                    else if(pokemon==1 && contrincante==2){
                        System.out.println("Ganaras la pelea con ataques secundarios");
                        System.out.println("Charmander vs Bulbasaur");
                        hp=35;
                        fuerza=18;
                        defensa=20;
                        atp=10;
                        ats=15;
                        System.out.println("Fuerza de ambos: "+fuerza);
                        System.out.println("Defensa de ambos: "+defensa);
                        System.out.println("Charmander utiliza un ataque secundario");
                        impacto1=(fuerza*defensa)/3;
                        hpf=hp-impacto1;
                           if(hpf<=0){
                            System.out.println("La vida del enemigo es de "+hpf);
                            System.out.println("Has ganado!");
                            }      
                            else if(hpf>0){
                            System.out.println("El enemigo uso hacks y te cerro el juego");
                            }
                    }
                    else if(pokemon==1 && contrincante==3){
                        System.out.println("Tu pokemon estara cansado antes de que el otro lo este");
                        System.out.println("Charmander vs Squirtle");
                        hp=35;
                            fuerza=18;
                            defensa=20;
                            atp=10;
                            ats=15;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Charmander utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                    }
                    else if(pokemon==2 && contrincante==1){
                        System.out.println("Tu pokemon estara cansado antes de que el otro lo este");
                        System.out.println("Bulbasaur vs Charmander");
                        hp=30;
                            fuerza=16;
                            defensa=23;
                            atp=8;
                            ats=15;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Bulbasaur utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                    }
                    else if(pokemon==2 && contrincante==3){
                        System.out.println("Ganaras la pelea con ataques secundarios");
                        System.out.println("Bulbasaur vs Squirtle");
                        hp=30;
                            fuerza=16;
                            defensa=23;
                            atp=8;
                            ats=15;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Bulbasaur utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                    }
                    else if(pokemon==3 && contrincante==1){
                        System.out.println("Ganaras la pelea con ataques secundarios");
                        System.out.println("Squirtle vs Charmander");
                        hp=30;
                            fuerza=20;
                            defensa=17;
                            atp=17;
                            ats=30;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Squirtle utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                    }
                    else if(pokemon==3 && contrincante==2){
                        System.out.println("Tu pokemon estara cansado antes de que el otro lo este");
                        System.out.println("Squirtle vs Bulbasaur");
                        hp=30;
                            fuerza=20;
                            defensa=17;
                            atp=17;
                            ats=30;
                            System.out.println("Fuerza de ambos: "+fuerza);
                            System.out.println("Defensa de ambos: "+defensa);
                            System.out.println("Squirtle utiliza un ataque secundario");
                            impacto1=(fuerza*defensa)/3;
                            hpf=hp-impacto1;
                               if(hpf<=0){
                                System.out.println("La vida del enemigo es de "+hpf);
                                System.out.println("Has ganado!");
                                }      
                                else if(hpf>0){
                                System.out.println("El enemigo uso hacks y te cerro el juego");
                                }
                    }
                    System.out.println("Desdea iniciar otra pelea? si=s no=x");
                    retorno= entrada.next().charAt(0);
                }while(retorno=='s');
                default:
                System.out.println("Gracias, suerte aventurero");
                    break;
            }
        }while(opcion=='s');
    }
}