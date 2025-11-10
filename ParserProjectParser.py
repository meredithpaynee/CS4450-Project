# Generated from ParserProject.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,3,17,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,
        3,1,15,8,1,1,1,0,0,2,0,2,0,0,15,0,4,1,0,0,0,2,14,1,0,0,0,4,5,3,2,
        1,0,5,6,5,1,0,0,6,7,3,2,1,0,7,8,5,1,0,0,8,9,3,2,1,0,9,10,5,0,0,1,
        10,1,1,0,0,0,11,15,1,0,0,0,12,13,5,2,0,0,13,15,3,2,1,0,14,11,1,0,
        0,0,14,12,1,0,0,0,15,3,1,0,0,0,1,14
    ]

class ParserProjectParser ( Parser ):

    grammarFileName = "ParserProject.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'a'", "'b'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "WS" ]

    RULE_start = 0
    RULE_x = 1

    ruleNames =  [ "start", "x" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    WS=3

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def x(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ParserProjectParser.XContext)
            else:
                return self.getTypedRuleContext(ParserProjectParser.XContext,i)


        def EOF(self):
            return self.getToken(ParserProjectParser.EOF, 0)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = ParserProjectParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.x()
            self.state = 5
            self.match(ParserProjectParser.T__0)
            self.state = 6
            self.x()
            self.state = 7
            self.match(ParserProjectParser.T__0)
            self.state = 8
            self.x()
            self.state = 9
            self.match(ParserProjectParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class XContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def x(self):
            return self.getTypedRuleContext(ParserProjectParser.XContext,0)


        def getRuleIndex(self):
            return ParserProjectParser.RULE_x

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterX" ):
                listener.enterX(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitX" ):
                listener.exitX(self)




    def x(self):

        localctx = ParserProjectParser.XContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_x)
        try:
            self.state = 14
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [-1, 1]:
                self.enterOuterAlt(localctx, 1)

                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 12
                self.match(ParserProjectParser.T__1)
                self.state = 13
                self.x()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





