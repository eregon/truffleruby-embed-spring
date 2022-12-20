package bootiful.ruby;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Engine;
import org.graalvm.polyglot.Source;

public class Application {

    public static void main(String[] args) {
        try (var engine = Engine.create()) {
            var source = Source.create("js", "21 + 21");
            try (var context = Context.newBuilder().engine(engine).build()) {
                var v = context.eval(source).asInt();
                System.out.println("the result : "   + v );
            }
        }
    }
}
