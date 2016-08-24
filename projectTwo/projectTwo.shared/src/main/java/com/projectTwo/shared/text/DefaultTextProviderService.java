package com.projectTwo.shared.text;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.services.common.text.AbstractDynamicNlsTextProviderService;

/**
 * <h3>{@link DefaultTextProviderService}</h3>
 *
 * @author Scout Robot
 */
@Order(-2000)
public class DefaultTextProviderService extends AbstractDynamicNlsTextProviderService {
  @Override
  protected String getDynamicNlsBaseName() {
    return "com.projectTwo.shared.texts.Texts";
  }
}
