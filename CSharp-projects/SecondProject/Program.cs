using SecondProject.Models; //indica o namespace da classe Pessoa

Console.WriteLine("Hello, World!");

Pessoa p = new Pessoa();

p.Nome = "Luana";
p.Idade = 22;

p.apresentar();

DateTime dataAtual = DateTime.Now;

Console.WriteLine(dataAtual.ToString("dd/MM/yyyy HH:mm:ss"));

DateTime dataSeguinte = DateTime.Now.AddDays(5);
