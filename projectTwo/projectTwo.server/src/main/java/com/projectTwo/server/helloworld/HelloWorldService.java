package com.projectTwo.server.helloworld;

import com.projectTwo.server.ServerSession;
import com.projectTwo.shared.helloworld.HelloWorldFormData;
import com.projectTwo.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author Scout Robot
 */
public class HelloWorldService implements IHelloWorldService {

  @Override
  public HelloWorldFormData load(HelloWorldFormData input) {
    StringBuilder msg = new StringBuilder();
    msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
    input.getMessage().setValue(msg.toString());
    return input;
  }
}
