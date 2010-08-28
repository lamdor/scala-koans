package org.scalakoans.support

object BlankValues {
    class ReplaceWithCorrectException extends Exception

    val __ = "Should be filled in"
    class ___ extends ReplaceWithCorrectException {
        override def toString() = "___"
    }
}

