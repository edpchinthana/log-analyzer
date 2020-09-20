package operations.loganalyzer;

import input.Input;
import input.commandline.CommandLineInput;
import logRepository.LogRepository;
import logRepository.LogRepositoryImpl;
import operations.mainmenu.MainMenuOperation;
import output.Output;
import output.commandline.CommandlineUserOutput;

public class AnalyzeLogFile implements MainMenuOperation {
    @Override
    public void execute() {
        Output output = new CommandlineUserOutput();
        Input input = new CommandLineInput();
        LogRepository logRepository = new LogRepositoryImpl();

        output.displayFilePath();
        String filePath = input.readFilePath();
        //logRepository.readLogFile(logRepository,)
    }
}
