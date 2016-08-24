package com.projectTwo.client.search;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractSearchOutline;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.projectTwo.shared.Icons;

/**
 * <h3>{@link SearchOutline}</h3>
 *
 * @author Scout Robot
 */
@Order(2000)
public class SearchOutline extends AbstractSearchOutline {

  private static final Logger LOG = LoggerFactory.getLogger(SearchOutline.class);

  @Override
  protected void execSearch(final String query) {
    LOG.info("Search started");
    // TODO [Scout Robot]: Implement search
  }

  @Override
  protected String getConfiguredIconId() {
    return Icons.Search;
  }
}
