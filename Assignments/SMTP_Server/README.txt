CODE:
    - MySMTPServer: is the code for the actual server which will be connected into.
    - Connection: is each connection made to the server. IS a seperate thread.
    - Email: simple class of an email object

COMPILATION:
    - compile and run MySMTPServer and the related .java files (See CODE subsection for list of files)
    - Log files are made in the folder from which compilation is made

RUN:
    - The Fake SMTP server can be run using the command "telnet localhost 1063" * the port number will change according to its value in MySMTPServer.java

TEST:
    - I have only managed to test this with numerous terminals (console,putty) locally. See above for run help.

OTHER ITEMS IN AGENDA:
    - The log files contain a few extra lines of information. If you do not want them, please just comment out the respective lines in Email.java -> formatEmailOutput()
    - I have tried to duplicate the way the normal telnet server on the university server runs.
