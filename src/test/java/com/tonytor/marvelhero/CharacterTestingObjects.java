package com.tonytor.marvelhero;

import com.tonytor.marvelhero.model.Character;

public class CharacterTestingObjects {
    public static final Character TEST0 = new Character();
    public static final Character TEST1 = new Character();
    public static final Character TEST2 = new Character();
    public static final Character TEST_NO_WRONG0 = new Character();
    public static final Character TEST_NO_WRONG1 = new Character();

    public static final Character TEST_NULL = new Character();

    public static final Character TEST_WRONG0 = new Character();
    public static final Character TEST_WRONG1 = new Character();
    public static final Character TEST_WRONG2 = new Character();
    public static final Character TEST_WRONG3 = new Character();
    public static final Character TEST_WRONG4 = new Character();

    public static final Character TEST_UPDATE = new Character();

    static {
        TEST0.setId(1);
        TEST0.setName("Iron Man");
        TEST0.setCreated(UtilTest.DATE);
        TEST0.setDescription("Iron Man is a superhero appearing in American comic books published by Marvel Comics. The character was co-created by writer and editor Stan Lee, developed by scripter Larry Lieber, and designed by artists Don Heck and Jack Kirby. The character made his first appearance in Tales of Suspense #39 (cover dated March 1963), and received his own title in Iron Man #1 (May 1968). Also in 1963, the character founded the Avengers alongside Thor, Ant-Man, Wasp and the Hulk.\n" +
                "\n" +
                "A wealthy American business magnate, playboy, philanthropist, inventor and ingenious scientist, Anthony Edward \"Tony\" Stark suffers a severe chest injury during a kidnapping. When his captors attempt to force him to build a weapon of mass destruction, he instead creates a mechanized suit of armor to save his life and escape captivity. Later, Stark develops his suit, adding weapons and other technological devices he designed through his company, Stark Industries. He uses the suit and successive versions to protect the world as Iron Man. Although at first concealing his true identity, Stark eventually publicly reveals himself to be Iron Man.\n" +
                "\n" +
                "Initially, Iron Man was a vehicle for Stan Lee to explore Cold War themes, particularly the role of American technology and industry in the fight against communism. Subsequent re-imaginings of Iron Man have transitioned from Cold War motifs to contemporary matters of the time.");
        TEST0.setImage(ImageTestingObjects.TEST0);

        TEST1.setId(2);
        TEST1.setName("Hulk");
        TEST1.setCreated(UtilTest.DATE);
        TEST1.setDescription("The Hulk is a fictional character and superhero appearing in publications by the American publisher Marvel Comics. Created by writer Stan Lee and artist Jack Kirby, the character first appeared in the debut issue of The Incredible Hulk (May 1962). In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a vast degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist. The two exist as independent dissociative personalities, and resent each other.\n" +
                "Hulk comic logo\n" +
                "\n" +
                "Following his accidental exposure to gamma rays saving the life of Rick Jones during the detonation of an experimental bomb, Banner is physically transformed into the Hulk when subjected to emotional stress, at or against his will, often leading to destructive rampages and conflicts that complicate Banner's civilian life. The Hulk's level of strength is normally conveyed as proportionate to his level of anger. Commonly portrayed as a raging savage, the Hulk has been represented with other personalities based on Banner's fractured psyche, from a mindless, destructive force, to a brilliant warrior, or genius scientist in his own right. Despite both Hulk and Banner's desire for solitude, the character has a large supporting cast. This includes Banner's lover Betty Ross, his best friend Rick Jones, his cousin She-Hulk, and therapist and ally Doc Samson. In addition, the Hulk alter ego has many key supporting characters like his co-founders of the superhero team the Avengers, his queen Caiera, fellow warriors Korg and Miek, and sons Skaar and Hiro-Kala. However, his uncontrollable power has brought him into conflict with his fellow heroes and others. Despite this, he tries his best to do what's right while battling villains such as Leader, Abomination, Absorbing Man and more. ");
        TEST1.setImage(ImageTestingObjects.TEST0);

        TEST2.setId(3);
        TEST2.setName("Black Widow");
        TEST2.setCreated(UtilTest.DATE);
        TEST2.setDescription("Natalia Alianovna \"Natasha Romanoff\" Romanova[1] (Black Widow) is a fictional character appearing in American comic books published by Marvel Comics. Created by editor and plotter Stan Lee, scripter Don Rico, and artist Don Heck, the character debuted in Tales of Suspense #52 (April 1964). The character was introduced as a Russian spy, an antagonist of the superhero Iron Man. She later defected to the United States, becoming an agent of the fictional spy agency S.H.I.E.L.D. and a member of the superhero team the Avengers.\n" +
                "\n" +
                "The character has appeared in numerous forms of media, such as animated television series, video games, and films; with Scarlett Johansson portraying the character in several Marvel Cinematic Universe films including Iron Man 2 (2010), The Avengers (2012), Captain America: The Winter Soldier (2014), Avengers: Age of Ultron (2015), Captain America: Civil War (2016), a cameo in Thor: Ragnarok (2017), Avengers: Infinity War (2018), a cameo in Captain Marvel (2019), Avengers: Endgame (2019) and the upcoming Black Widow (2021). ");
        TEST2.setImage(ImageTestingObjects.TEST0);

        TEST_NO_WRONG0.setId(4);
        TEST_NO_WRONG0.setName("xk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQ");
        TEST_NO_WRONG0.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_NO_WRONG0.setDescription("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");
        TEST_NO_WRONG0.setImage(ImageTestingObjects.TEST0);

        TEST_NO_WRONG1.setId(10);
        TEST_NO_WRONG1.setName("");
        TEST_NO_WRONG1.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_NO_WRONG1.setDescription("");
        TEST_NO_WRONG1.setImage(ImageTestingObjects.TEST0);


        TEST_WRONG0.setId(5);
        TEST_WRONG0.setName("dxk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQ");
        TEST_WRONG0.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_WRONG0.setDescription("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");
        TEST_WRONG0.setImage(ImageTestingObjects.TEST0);


        TEST_WRONG1.setId(6);
        TEST_WRONG1.setName("xk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQ");
        TEST_WRONG1.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_WRONG1.setDescription("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");
        TEST_WRONG1.setImage(ImageTestingObjects.TEST0);

        TEST_WRONG2.setId(7);
        TEST_WRONG2.setName("xk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQ");
        TEST_WRONG2.setCreated(null);
        TEST_WRONG2.setDescription("xk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQLq9vcZqP2pwG6HevY9qsouQXIfQVHDlwLIJW7feiXbjgb9mOm848ePMmTsgPywPbCaCSFZ9JWP5CtZH0lB7g4jIjq0bTJky8rXfDG36XS6hGKETJznx0syIVaZBuOGp0dlsUKTdZDez3DWfshqJ8gwuYLg9lVpidBSI2Kh85q0k9EknpyEjiclpXt6qcQLCNrLZaykSrvNrRXjBWtkgkQEhAKXN0eVFo6vuDq1G3jqDOXiKGf02mDkSWOYz8cDwgASl6KyVpUGxYNe3PUKNErL7DpI6ZXlkzUO8aKPEQAKlTu25Bf5KxKzJbBwIO7agrOe8qdFeOCudVauPgI4jkvc1VKi8MPe2Z4KIbosUOLdEB2hCQOjt2GGxwVUaaC1y5oQjp11bh8qQbMHOecn1FKixLGiSiaJe2896C4EtYbsEmFGEbQ7VhguK5QtY7h5J78UZoDVuW7AcFu0bfDJtpA2mmisu7ZErVNy53XeVZKJq7UNdw8gT8JvkE8MAbMWEhvjvfqiNx7UTmelEeLIV4HRFfHOPTVPX6uV2YyCI0hkPzGHFEhMs4QdazwJB6a91blTIx73AakWyvProIpnYcZuXvBeQzcWfMzigxU2pNXM3ypmmptXSyo5Mu18UDJR7CSpbzRFjBOBsykMx2ToKpzGqYf4qnt7UCcmgYGok6sn3STa3EZb2eI2dBI3eKz01LGzFixiBaupvZaS6RJMFtPTdc6eGPYQPweLG02BTmxQhvvhp6xs34GgXzvzWneSueftdXRmqq24juiT0PbmeP5hVlqYM2mc5WovrZijnzSZkg7yIhLJ5pOtmUoSvIvgAWuKN1I6AHpnwNVPyrxwKg63oJGuRrPiDfs43awHdEJaUnlFNKYDyWTVqYyAJBpotOF11GN6ezdI4cOSM5Vb15N6R7mBsZXqG7x8rnziHBEpTE2OOkc9XghfXTcHPVs3MBszf8s9yZXWnVOvjcfOsxR2vfJ0p0Uq1Nn0PNEEpj2TPmWBybjEFDNaCAPmFStohDxqMde0aa0qotgItJrnRnD1BJTQdLj0eCtaxFrqXBOgUjsZXueDA2ZFnf8R6myeYvEIw0bUE3XK6JFUneKxt3KCYr6oofyk9t4Kb8Z9wzXgw2I25gwFKlkfiYZaWZKuSQeisPz1c3O9d6WGFG05iEekfQIhoZEfzMqQsjJN6qzR2GI3wpTFYbjBewRY6oNU11kspXDfDsavOXl3hMhka375PJVHjA0m6GATbxXGdy4PVntSBmiWGTi3kHeGITUS3h1IAlpsDsfTK0Gl2NsW6LY1Zrj35o7Cznw03fBoqDDHxBF7GYoJ1XxTUkh7ONeTF3yz27DQze0NCFkExcaHQslAFBVqUH55lRbAH89K1NDZ5K8bA3nFZpa7w46iqrRElwUsJ4k39P0KBjKXG8Vg80xX26PZ5e1NNCQpt8lGxJOqRrdpoAuos5BfboxIDE0qc4e8g47dJagFLjzUdX9doVMvai6OqWXpFAuGU52azgtcTx0f7Ol0n7gb957hWQhfj1jfnzPnuAbR8zh9bRmVH0kKF64baXFDwOc0xOAK7uCZsB1jler6VPLjJdqR3wDtOYujVGnfIuXPlOdnwtRZ4D99cksh4wEdPHprg2kXnif9NhncHNqaYW3e65konz2AjkD8laqlwJsTwcUM7tSFnMNJorbx2KapinUlNyyFNY9BBv8sIzpmREUCCgfzD6n5393lElwfR1ZABYeJjyh0khDRtZj0ciNYqusuRpCJZi2oXFZcJKDl43PigLVE5f30xVKOBf5Je81I31tGKawADijgXX1wzVlWZn6d0JEyKztYyLHdZRjylMxGfCVGRGJ06VGbNWmRtEGmwHXa8xXAe3lhQjmy1ABCAenv3fcWLI3pzTgvch46oUjWO04j1timYJFHX3g7lwbMH1GOaTKK1JdN5aWNWji2");
        TEST_WRONG2.setImage(ImageTestingObjects.TEST0);

        TEST_WRONG3.setId(8);
        TEST_WRONG3.setName(null);
        TEST_WRONG3.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_WRONG3.setDescription("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");

        TEST_WRONG4.setId(9);
        TEST_WRONG4.setName("xk3St9D4RQDvNS7RQ4PxZ6AskVAsYabbG0wH2F7LF8WcTbl8zQ");
        TEST_WRONG4.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_WRONG4.setDescription(null);

        TEST_UPDATE.setId(1);
        TEST_UPDATE.setName("Iron-Man");
        TEST_UPDATE.setCreated(UtilTest.NO_WRONG_DATE);
        TEST_UPDATE.setDescription("Mini description");
    }
}
