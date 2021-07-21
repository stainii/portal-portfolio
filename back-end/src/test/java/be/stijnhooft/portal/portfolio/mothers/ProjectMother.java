package be.stijnhooft.portal.portfolio.mothers;

import be.stijnhooft.portal.portfolio.model.Project;

import java.time.LocalDate;
import java.util.Arrays;

public class ProjectMother {

    public static Project complete() {
        return new Project("unionvms",
            "UnionVMS",
            "The European fishery business is going through a big transition. The European Union demands more communication between the member states, in a unified way. This means: over their brand new FLUX network.\n" +
                "\n" +
                "[Description] Realizing this project means that every member state needs a big platform, and that not a little thing to ask all members states to do, especially not in times of tight budgets and savings. Wouldn't it be smarter to have one European base framework, which every member state can use and extend?\n" +
                "\n" +
                "Enter UnionVMS: an open-source vessel management system, built with modularity and extensibility in mind. This project has been started by Sweden and the European Commission, and Belgium joins in 2017.\n" +
                "\n" +
                "One problem: Landbouw & Visserij, the official instance for fishery in Belgium, is a .NET bastion, while this open source framework is being built in Java! That's where Mathias and I come in!",
            "<img src=\"data/projects/unionVMS/unionVMS.png\" alt=\"\" />",
            "lead developer",
            "The European fishery business is going through a big transition. The European Union demands more communication between the member states, in a unified way. This means: over their brand new FLUX network.\n" +
                "\n" +
                "Realizing this project means that every member state needs a big platform, and that not a little thing to ask all members states to do, especially not in times of tight budgets and savings. Wouldn't it be smarter to have one European base framework, which every member state can use and extend?\n" +
                "\n" +
                "Enter UnionVMS: an open-source vessel management system, built with modularity and extensibility in mind. This project has been started by Sweden and the European Commission, and Belgium joins in 2017.\n" +
                "\n" +
                "One problem: Agriculture & Fisheries, the official instance for fishery in Belgium, is a .NET bastion, while this open source framework is being built in Java! That's where Mathias and I come in!\n" +
                "\n" +
                "\n" +
                " \n" +
                " \n" +
                "Check out the official project website!",
            LocalDate.of(2016, 12, 1),
            null, "Flemish Government, department Agriculture and Fisheries", Arrays.asList("docker", "jax-rs", "jpa"));
    }

    public static Project completeAlternative() {
        return new Project("colruyt",
            "Colruyt",
            "In 2016, Colruyt was making a big switch, from mainframe-based applications to Java EE web applications. During its long history, Colruyt has built a rich experience in mainframe technologies, but it's not easy to bring that over to the Java world. They could use some guidance in that process. One of the means to get there, is hiring Java consultants.\n" +
                "\n" +
                "During my time at Colruyt, I've had a very broad role. I've spent my time on:\n" +
                "\n" +
                "projects\n" +
                "coaching, by pair-programming, writing tutorials and giving presentations\n" +
                "bringing the right people together, to introduce improvements in their tooling\n" +
                "researching what their current tools can do, and where they are limited",
            "<img src=\"data/projects/colruyt/colruyt.png\" alt=\"\" />",
            "(lead) developer, coach, innovator",
            "In 2016, Colruyt was making a big switch, from mainframe-based applications to Java EE web applications. During its long history, Colruyt has built a rich experience in mainframe technologies, but it's not easy to bring that over to the Java world. They could use some guidance in that process. One of the means to get there, is hiring Java consultants.\n" +
                "\n" +
                "During my time at Colruyt, I've had a very broad role. I've spent my time on:\n" +
                "\n" +
                "projects\n" +
                "coaching, by pair-programming, writing tutorials and giving presentations\n" +
                "bringing the right people together, to introduce improvements in their tooling\n" +
                "researching what their current tools can do, and where they are limited\n" +
                "It was sometimes a frustrating, and other times a satisfying ride. I've got a lot to thank the great colleagues for, for trusting me and giving me the time an space to introduce improvements. We had a lot of discussions, shared success and failures, and had a lot of fun moments.\n" +
                "\n" +
                "\n" +
                " \n" +
                "When I left Colruyt, they gave me a little souvenir. This truck got a prominent place in my bedroom :)",
            LocalDate.of(2016, 12, 1),
            null, "Flemish Government, department Agriculture and Fisheries", Arrays.asList("jax-ws", "jpa"));
    }
}
