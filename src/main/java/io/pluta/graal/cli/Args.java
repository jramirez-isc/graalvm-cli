package io.pluta.graal.cli;

import com.beust.jcommander.Parameter;

public class Args {
    @Parameter(names = { "-h", "--help" }, description = "print this help", help = true)
    private boolean help;

    @Parameter(names = "status", description = "check url status")
    private boolean status;

    public boolean isHelp() {
        return help;
    }

    public boolean isStatus() {
        return status;
    }
}