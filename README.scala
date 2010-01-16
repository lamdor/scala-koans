The current state of the source:

There is one Koan that is reasonably complete. It is the AboutAsserts koan and
has been used to shake down the koan framework. So far the KoanSuite test
class exits all tests in the current suite when there is one failure, but the
master suite runner continues to execute the other suites afterwards - this 
will change soon (so that the first failure quits immediately) and the nice
messages about karma and enlightenment will be added as well.

You will need maven to build.
