package com.projectTwo.shared.helloworld;

import org.eclipse.scout.rt.platform.service.IService;
import org.eclipse.scout.rt.shared.TunnelToServer;

import com.projectTwo.shared.helloworld.HelloWorldFormData;

/**
 * <h3>{@link IHelloWorldService}</h3>
 *
 * @author Scout Robot
 */
@TunnelToServer
public interface IHelloWorldService extends IService {
      HelloWorldFormData load(HelloWorldFormData input);
}
