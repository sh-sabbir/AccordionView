package dev.iamsabbir.accordionview;

/**
 * Created by sh-sabbir on 23/10/19.
 */

/***
 * This interface acts as a listener for the expansion and collapse of the accordion
 */
public interface AccordionExpansionCollapseListener {
    public void onExpanded(AccordionView view);
    public void onCollapsed(AccordionView view);


}
