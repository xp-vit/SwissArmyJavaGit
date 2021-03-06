package edu.nyu.cs.javagit.api.url;

import edu.nyu.cs.javagit.api.JavaGitException;

/**
 * Description : JavaGit FTP URL
 * Date: 2/23/14
 * Time: 7:32 PM
 */
public class FtpUrl
        extends JavaGitUrl {

    public FtpUrl(String host, int port, String file) {
        super(GitProtocol.FTP, null, host, port, file);
    }

    public FtpUrl(String host, String file)  {
        super(GitProtocol.FTP, null, host, 21, file);
    }

}
