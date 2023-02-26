import java.util.Scanner;



// Tic Toe using java

public class tictactoe {

    public static void main(String[] args) {
        int a = -1, b = -1;
        char flag[];
        flag = new char[9];
        System.out.println("//////////////////////Welcome To TIC TAC TOE /////////////////////////////");
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("'X':- It's Your turn");
            a = sc.nextInt();
            if (a == b) {
                System.out.println("Already selected by player O");
                break;

            }

            switch (a) {
                case 1:
                    flag[0] = 'X';

                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                    break;
                case 2:
                    flag[1] = 'X';
                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                    break;
                case 3:
                    flag[2] = 'X';

                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                    break;
                case 4:
                    flag[3] = 'X';

                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                    break;
                case 5:
                    flag[4] = 'X';

                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                    break;
                case 6:
                    flag[5] = 'X';

                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                    break;
                case 7:
                    flag[6] = 'X';
                    System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                    break;
                case 8:
                    flag[7] = 'X';
                    System.out.println(flag[0] + "  " + flag[1] + "    " + flag[2]);
                    System.out.println(flag[3] + "  " + flag[4] + "    " + flag[5]);
                    System.out.println(flag[6] + "  " + flag[7] + "    " + flag[8]);

                    break;
                case 9:
                    flag[8] = 'X';
                    System.out.println(flag[0] + "  " + flag[1] + "   " + flag[2]);
                    System.out.println(flag[3] + "  " + flag[4] + "   " + flag[5]);
                    System.out.println(flag[6] + "  " + flag[7] + "   " + flag[8]);

                    break;

                default:
                    System.out.println("Enter valid options");
                    break;
            }
            if (flag[0] == 'X' && flag[1] == 'X' && flag[2] == 'X') {
                System.out.println("Winner is-'X'");
                System.exit(0);

            } else {

                if (flag[3] == 'X' && flag[4] == 'X' && flag[5] == 'X') {
                    System.out.println("Winner is-'X'");
                    System.exit(0);
                } else {

                    if (flag[6] == 'X' && flag[7] == 'X' && flag[8] == 'X') {
                        System.out.println("Winner is-'X'");
                        System.exit(0);
                    } else {
                        if (flag[0] == 'X' && flag[4] == 'X' && flag[8] == 'X') {
                            System.out.println("Winner is-'X'");
                            System.exit(0);
                        } else {
                            if (flag[2] == 'X' && flag[4] == 'X' && flag[6] == 'X') {
                                System.out.println("Winner is-'X'");
                                System.exit(0);
                            } else {
                                if (flag[0] == 'X' && flag[3] == 'X' && flag[6] == 'X') {
                                    System.out.println("Winner is-'X'");
                                    System.exit(0);

                                } else {
                                    if (flag[1] == 'X' && flag[4] == 'X' && flag[7] == 'X') {
                                        System.out.println("Winner is-'X'");
                                        System.exit(0);
                                    } else {
                                        if (flag[2] == 'X' && flag[5] == 'X' && flag[8] == 'X') {
                                            System.out.println("Winner is-'X'");
                                            System.exit(0);
                                        }

                                    }
                                }

                            }

                        }
                    }
                }
                System.out.println("'O':- It's Your turn");
                b = sc.nextInt();
                if (b == a) {
                    System.out.println("Already selected by player O");
                    break;
                }
                switch (b) {

                    case 1:
                        flag[0] = 'O';

                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                        break;
                    case 2:
                        flag[1] = 'O';
                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                        break;
                    case 3:
                        flag[2] = 'O';

                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                        break;
                    case 4:
                        flag[3] = 'O';

                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                        break;
                    case 5:
                        flag[4] = 'O';

                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                        break;
                    case 6:
                        flag[5] = 'O';

                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);
                        break;
                    case 7:
                        flag[6] = 'O';
                        System.out.println(flag[0] + "   " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "   " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "   " + flag[7] + "   " + flag[8]);

                        break;
                    case 8:
                        flag[7] = 'O';
                        System.out.println(flag[0] + "  " + flag[1] + "    " + flag[2]);
                        System.out.println(flag[3] + "  " + flag[4] + "    " + flag[5]);
                        System.out.println(flag[6] + "  " + flag[7] + "    " + flag[8]);

                        break;
                    case 9:
                        flag[8] = 'O';
                        System.out.println(flag[0] + "  " + flag[1] + "   " + flag[2]);
                        System.out.println(flag[3] + "  " + flag[4] + "   " + flag[5]);
                        System.out.println(flag[6] + "  " + flag[7] + "   " + flag[8]);

                        break;

                    default:
                        System.out.println("Enter valid options");
                        break;
                }

                if (flag[0] == 'O' && flag[1] == 'O' && flag[2] == 'O') {
                    System.out.println("Winner is-'O'");
                    System.exit(0);

                } else {

                    if (flag[3] == 'O' && flag[4] == 'O' && flag[5] == 'O') {
                        System.out.println("Winner is-'O'");
                        System.exit(0);
                    } else {

                        if (flag[6] == 'O' && flag[7] == 'O' && flag[8] == 'O') {
                            System.out.println("Winner is-'O'");
                            System.exit(0);
                        } else {
                            if (flag[0] == 'O' && flag[4] == 'O' && flag[8] == 'O') {
                                System.out.println("Winner is-'O'");
                                System.exit(0);
                            } else {
                                if (flag[2] == 'O' && flag[4] == 'O' && flag[6] == 'O') {
                                    System.out.println("Winner is-'O'");
                                    System.exit(0);
                                } else {
                                    if (flag[0] == 'O' && flag[3] == 'O' && flag[6] == 'O') {
                                        System.out.println("Winner is-'O'");
                                        System.exit(0);

                                    } else {
                                        if (flag[1] == 'O' && flag[4] == 'O' && flag[7] == 'O') {
                                            System.out.println("Winner is-'O'");
                                            System.exit(0);

                                        } else {
                                            if (flag[2] == 'O' && flag[5] == 'O' && flag[8] == 'O') {
                                                System.out.println("Winner is-'O'");
                                                System.exit(0);

                                            }

                                        }

                                    }

                                }

                            }
                        }
                    }

                }

            }
        }
    }
}
