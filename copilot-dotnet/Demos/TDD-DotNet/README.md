# Test Driven Development (TDD) with C# and .NET through Visual Studio IDE

**Test-Driven Development (TDD)** is a software develpment proces relying on software requirements being converted to test cases before software is fully developed. Since unit testing or any type of functional or performance testings are very important in programming development, TDD practice is very highly encouraged among C# and.NET developers. Copilot is a great tool to help C# and .NET developers to write unit tests for their C# and .NET code as it can helps to bootstrap a lot of repetitive code for unit tests.

As you can see in the picture below, TDD process involves writing tests first, see if it fails (goes to red), then write code to make the test pass (green). Copilot can help you to write the test code and you can focus on writing the code to make the test pass.

![TDD](./images/tdd.jpg)

This demo is focusing around how to use Copilot to easily write unit tests for C# and .NET code. We will be using Visual Studio IDEA for this demo.

## Prerequisites

Make sure that you meet the following requirements.

- [Visual Studio IDE](https://visualstudio.microsoft.com/downloads/) for Windows
- [Copilot Extension for Visual Studio IDE](https://marketplace.visualstudio.com/items?itemName=GitHub.copilot). 

[See this documentation on how to install Copilot extension for Visual Studio IDE](../CopilotExtensionVS)

## Steps

Please follow this step-by-step guide to get started with Copilot in Visual Studio IDE.

### Step 1: Launch a project Visual Studio IDE

In your Windows, click bottom left's Windows button, then search for `Visual Studio`. Select Visual Studio IDE installed with Copilot.

![Open Visual Studio IDE](./images/0_VisualStudioSearch.jpg)

You can then select an existing project if you followed previous [Getting Started](../GettingStarted/) guide. Or, you can create a new projet if you don't have one.

![Select Project](./images/1_SelectProject.jpg)

### Step 2: Add new unit testing Project

Once your Visual Studio IDE is opened, you need to add a new project. From top, click **File** then select **Add**. Click **New Project...**.

![Add new project](./images/2_AddNewProject.jpg)

From there, search for `test`. You will see **Unit Test Project** shows up, so select that.

![Search Unit Test](./images/3_AddUnitTestProject.jpg)

Give your unit testing project some name. In my case, I named `TestWithCopilot`. This is going to be my namespace for this project.

![Give name](./images/4_AddName.jpg)

Once your new unit test project is created. Verify following things:

- Make sure that your GitHub Copilot is running as seen in the Output window
- Your `namespace` shows what you give as your Project name
- You can see two projects under **Solution Explorer** window

![Verify setting](./images/5_VerifySetting.jpg)

### Step 3: Renaming class and file

Although it is an optional step, we will try to rename our unit testing file and its class. I renmaed mine to **CopilotTest**

![Rename class](./images/6_RenameClass.jpg)

I also need to make a change to my file. On **Solutions Explorer** window, select the file to rename.

![Rename file](./images/7_RenameFile.jpg)

Once it is done, it shoudld look something like this.

![After renaming](./images/8_FinishRenaming.jpg)

### Step 4: Hook up with dependency

Our unit testing project is dependent on our other project (e.g. HelloCopilot). Thus, we need to add a dependency.

Make sure that you select your unit testing project under **Solution Explorer**.

![Select Test Project](./images/9_SelectTestProject.jpg)

Then, we need to make following two changes. First, select **Project** under top tool menu. Under a new dropdown menu, scroll down to select **Project Dependencies...**.

![Select Project Dependecy](./images/10_ProjectDependency.jpg)

Then, check your source code project and click **OK** to save.

![Select source code](./images/11_AddProjectDependency.jpg)

Next, we need to add our source code project as a reference to our unit testing project. To do that, select **Project** under tool menu again. But this time, select **Add Reference...**.

![Add reference](./images/12_ProjectReference.jpg)

Then, click **Projects** followed by **Solution**. You should see your source code project, so select that. Click **OK** button to save.

![Add reference](./images/13_AddProjectReference.jpg)

### Step 5: Build project

Let's build project. On top menu tool bar, click **Build** then select **Build Solution**.

![Build](./images/14_BuildHello.jpg)

This should print out a message like this under **Output** window.

![Build output](./images/15_OutputBuild.jpg)

### Step 6: Getting ready to write unit test

We are finally ready to implement our unit test in TDD style. But first, add the following line in your unit testing class. You need to add your source code project namespace with `using` keyword. For example, in my example below, I added `using HelloCopilot` because `HelloCopilot` is my namespace for my source code project.

![Add namespace](./images/16_AddClass.jpg)

You will notice that it generates a sample test method. As you try to type in it, Copilot might generate some test method as you see above.

But there is one change that we definitely need to make before running this, especially if you followed previous [Getting Started](../GettingStarted/) example. In your source code class, change that visibility of class from `internal` to `public`.

![Change visibility](./images/17_ExistingFunction.jpg)

Now, we are ready to write actual unit test!

### Step 7: Writing unit tests in TDD style

We could use existing method, but we will just write a new unit test from scratch. Just rename your function to something like `AddTwoNumbersEqualsCorrect`. Then, Copilot will try to generate a test method with a function that does not yet exist.

![Add a new method](./images/18_NewTest.jpg)

Let's go to our source code class. As you click under class, you should that Copilot will try to generate suggestion like this based on the method you added in your test class.

![Generating with Copilot](./images/19_GenerateFunction.jpg)

Let's accept that suggestion. Next, let's try to build. Click **Build** under tool bar, then select **Build Solution**.

![Build solution](./images/20_BuildTest.jpg)

Next, let's try to run unit test. Click **Test** under tool bar, and select **Run All Tests**.

![Run tests](./images/21_RunTest.jpg)

This will bring a pop up window showing that your test is successful. Congratulation! You just wrote a TDD style unit test through C# and .NET.

![Successful test](./images/22_TestSuccess.jpg)

You can try to add more unit test like this. For example, Copilot automatically suggests some failure scenario for me.

![Another test](./images/23_AddMoreTest.jpg)

Of course, if you accept the suggestion, it will look like this. But feel free to add your own unit test.

![Accepted suggestion](./images/24_AfterAddingTest.jpg)

And this is the result after running our second test.

![Run second test](./images/25_Completion.jpg)

After this, you can add some more custom example using String, sorting function, etc. But as you can see, Copilot can help you eaisly adopt Test Driven Development (TDD) in an easy way as possible. Or, should we say **Copilot Driven Development**?
